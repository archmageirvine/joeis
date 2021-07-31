package irvine.oeis.a033;

/**
 * A033916 Numbers k such that s(k) + s(k+1) + ... + s(k+14) = t(k) + t(k+1) + ... + t(k+14).
 * @author Sean A. Irvine
 */
public class A033916 extends A033910 {

  @Override
  protected long m() {
    return 14;
  }
}
