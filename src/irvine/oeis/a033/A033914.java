package irvine.oeis.a033;

/**
 * A033914 Numbers k such that s(k) + s(k+1) + ... + s(k+7) = t(k) + t(k+1) + ... + t(k+7).
 * @author Sean A. Irvine
 */
public class A033914 extends A033910 {

  @Override
  protected long m() {
    return 7;
  }
}
