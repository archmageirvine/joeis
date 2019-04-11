package irvine.oeis.a002;

/**
 * A002280 <code>a(n) = 6*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002280 extends A002275 {

  @Override
  protected long unit() {
    return 6;
  }

}
