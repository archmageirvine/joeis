package irvine.oeis.a002;

/**
 * A002279 <code>a(n) = 5*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002279 extends A002275 {

  @Override
  protected long unit() {
    return 5;
  }

}
