package irvine.math.padic;

/**
 * Container for the p-adic expansion of a number.  These expansions are lazily
 * evaluated with terms computed on an as-needed basis.
 * @author Sean A. Irvine
 */
public abstract class AbstractPAdic implements PAdic {

  @Override
  public abstract long get(final int n);

  @Override
  public abstract long p();

  @Override
  public int val() {
    int k = 0;
    while (get(k) == 0) {
      ++k;
    }
    return k;
  }

  @Override
  public String toString(final int n) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= n; ++k) {
      if (k > 0) {
        sb.append(',');
      }
      sb.append(get(k));
    }
    return sb.toString();
  }
}
