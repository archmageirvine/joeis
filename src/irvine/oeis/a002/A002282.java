package irvine.oeis.a002;

/**
 * A002282 <code>a(n) = 8*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A002282 extends A002275 {

  @Override
  protected long unit() {
    return 8;
  }

}
