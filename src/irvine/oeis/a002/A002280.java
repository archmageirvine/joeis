package irvine.oeis.a002;

/**
 * A002280 a(n) = 6*(10^n - 1)/9.
 * @author Sean A. Irvine
 */
public class A002280 extends A002275 {

  @Override
  protected long unit() {
    return 6;
  }

}
