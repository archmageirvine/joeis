package irvine.oeis.a002;

/**
 * A002278 a(n) = 4*(10^n - 1)/9.
 * @author Sean A. Irvine
 */
public class A002278 extends A002275 {

  @Override
  protected long unit() {
    return 4;
  }

}
