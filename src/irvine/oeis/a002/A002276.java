package irvine.oeis.a002;

/**
 * A002276 <code>a(n) = 2*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002276 extends A002275 {

  @Override
  protected long unit() {
    return 2;
  }

}
