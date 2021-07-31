package irvine.oeis.a033;

/**
 * A033912 Numbers k such that s(k) + s(k+1) + ... + s(k+4) = t(k) + t(k+1) + ... + t(k+4).
 * @author Sean A. Irvine
 */
public class A033912 extends A033910 {

  @Override
  protected long m() {
    return 4;
  }
}
