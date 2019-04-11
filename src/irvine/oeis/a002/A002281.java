package irvine.oeis.a002;

/**
 * A002281 <code>a(n) = 7(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002281 extends A002275 {

  @Override
  protected long unit() {
    return 7;
  }

}
