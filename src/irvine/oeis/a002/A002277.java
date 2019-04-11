package irvine.oeis.a002;

/**
 * A002277 <code>a(n) = 3*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002277 extends A002275 {

  @Override
  protected long unit() {
    return 3;
  }

}
