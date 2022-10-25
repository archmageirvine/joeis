package irvine.oeis.a030;

/**
 * A030728 The second list after the following procedure: starting with a list [3] and an empty list, repeatedly add the distinct values already in both lists in ascending order to the second list and add the corresponding frequencies of those values to the first list.
 * @author Sean A. Irvine
 */
public class A030728 extends A030727 {

  @Override
  protected long select(final long a, final long b) {
    return b;
  }
}
