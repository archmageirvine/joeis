package irvine.math.group;

import java.util.Collections;
import java.util.Map;

import irvine.math.api.Group;
import irvine.math.api.Operation;
import irvine.math.api.Set;
import irvine.util.string.StringUtils;

/**
 * Utility class for producing LaTeX format Cayley tables of finite groups.
 *
 * @author Sean A. Irvine
 */
public final class CayleyTable {

  private CayleyTable() { }

  private static final String LS = System.lineSeparator();

  private static <E> String label(final Map<E, String> labels, final E element) {
    final String l = labels.get(element);
    return l != null ? l : element.toString();
  }

  /**
   * Return a string representing the Cayley table for the operation on
   * the specified set of elements.  The table is
   * wrapped up in the LaTeX tabular format.
   * @param <E> element type
   * @param operation operation to generate table for
   * @param operator string to use for the operator symbol
   * @param labels optional replacement labels for operation elements
   * @param alignment LaTeX alignment for table
   * @return LaTeX format Cayley table
   * @throws UnsupportedOperationException for an infinite operation.
   * @throws ArithmeticException if the operation is finite but too large.
   */
  public static <E> String cayleyTable(final Operation<E> operation, final String operator, final Map<E, String> labels, final char alignment) {
    final Set<E> elements = operation.codomain();
    if (elements.isInfinite()) {
      throw new UnsupportedOperationException();
    }
    final int size = elements.size().intValueExact();
    final StringBuilder sb = new StringBuilder();
    sb.append("\\begin{tabular}{r|")
      .append(StringUtils.rep(alignment, size))
      .append('}')
      .append(LS)
      .append(operator);
    for (final E element : elements) {
      sb.append('&').append(label(labels, element));
    }
    sb.append("\\\\\\hline").append(LS);
    for (final E a : elements) {
      final String label = label(labels, a);
      if (label.startsWith("[")) {
        sb.append("{}");
      }
      sb.append(label);
      for (final E b : elements) {
        sb.append('&').append(label(labels, operation.op(a, b)));
      }
      sb.append("\\\\").append(LS);
    }
    sb.append("\\end{tabular}").append(LS);
    return sb.toString();
  }

  /**
   * Return a string representing the Cayley table for the group.  The table is
   * wrapped up in the LaTeX tabular format.
   * @param <E> element type
   * @param group group to generate table for
   * @param operator string to use for the operator symbol
   * @param labels optional replacement labels for group elements
   * @param alignment LaTeX alignment for table
   * @return LaTeX format Cayley table
   * @throws UnsupportedOperationException for an infinite group.
   * @throws ArithmeticException if the group is finite but too large.
   */
  public static <E> String cayleyTable(final Group<E> group, final String operator, final Map<E, String> labels, final char alignment) {
    return cayleyTable(group.operation(), operator, labels, alignment);
  }

  /**
   * Return a string representing the Cayley table for the group.  The table is
   * wrapped up in the LaTeX tabular format.
   * @param group group to generate table for
   * @param operator string to use for the operator symbol
   * @param <E> element type
   * @return LaTeX format Cayley table
   * @throws UnsupportedOperationException for an infinite group.
   * @throws ArithmeticException if the group is finite but too large.
   */
  public static <E> String cayleyTable(final Group<E> group, final String operator) {
    return cayleyTable(group, operator, Collections.emptyMap(), 'c');
  }

  /**
   * Return a string representing the Cayley table for the operation.  The table is
   * wrapped up in the LaTeX tabular format.
   * @param operation operation to generate table for
   * @param operator string to use for the operator symbol
   * @param <E> element type
   * @return LaTeX format Cayley table
   * @throws UnsupportedOperationException for an infinite operation.
   * @throws ArithmeticException if the operation is finite but too large.
   */
  public static <E> String cayleyTable(final Operation<E> operation, final String operator) {
    return cayleyTable(operation, operator, Collections.emptyMap(), 'c');
  }

  /**
   * Return a string representing the Cayley table for the group.  The table is
   * wrapped up in the LaTeX tabular format.
   * @param group group to generate table for
   * @param <E> element type
   * @return LaTeX format Cayley table
   * @throws UnsupportedOperationException for an infinite group.
   * @throws ArithmeticException if the group is finite but too large.
   */
  public static <E> String cayleyTable(final Group<E> group) {
    return cayleyTable(group, "");
  }

  /**
   * Create the Cayley table for the named groups.
   * @param args list of group names
   */
  public static void main(final String... args) {
    for (final String s : args) {
      System.out.println(CayleyTable.cayleyTable(GroupFactory.createGroup(s)));
    }
  }
}
