package irvine.oeis.a006;

/**
 * A006978.
 * @author Sean A. Irvine
 */
public class A006978 extends A006977 {

  private static final boolean[] A = {false, true, true, true, false, true, true, false};

  @Override
  protected boolean isSet(final int v) {
    return A[v];
  }
}
