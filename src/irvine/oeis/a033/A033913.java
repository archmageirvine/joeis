package irvine.oeis.a033;

/**
 * A033913 Numbers k such that s(k) + s(k+1) + ... + s(k+6) = t(k) + t(k+1) + ... + t(k+6).
 * @author Sean A. Irvine
 */
public class A033913 extends A033910 {

  @Override
  protected long m() {
    return 6;
  }
}
