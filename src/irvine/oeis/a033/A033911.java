package irvine.oeis.a033;

/**
 * A033911 Numbers k such that s(k) + s(k+1) + ... + s(k+3) = t(k) + t(k+1) + ... + t(k+3).
 * @author Sean A. Irvine
 */
public class A033911 extends A033910 {

  @Override
  protected long m() {
    return 3;
  }
}
