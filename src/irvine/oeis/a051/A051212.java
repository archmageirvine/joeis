package irvine.oeis.a051;

/**
 * A051212 Numbers of the form x^2-10^y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051212 extends A051204 {

  @Override
  protected long base() {
    return 10;
  }
}
