package irvine.oeis.a002;

/**
 * A002281 a(n) = 7(10^n - 1)/9.
 * @author Sean A. Irvine
 */
public class A002281 extends A002275 {

  @Override
  protected long unit() {
    return 7;
  }

}
