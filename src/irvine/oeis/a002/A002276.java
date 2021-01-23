package irvine.oeis.a002;

/**
 * A002276 a(n) = 2*(10^n - 1)/9.
 * @author Sean A. Irvine
 */
public class A002276 extends A002275 {

  @Override
  protected long unit() {
    return 2;
  }

}
