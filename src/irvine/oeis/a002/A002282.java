package irvine.oeis.a002;

/**
 * A002282 a(n) = 8*(10^n - 1)/9.
 * @author Sean A. Irvine
 */
public class A002282 extends A002275 {

  @Override
  protected long unit() {
    return 8;
  }

}
