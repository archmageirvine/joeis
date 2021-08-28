package irvine.oeis.a051;

/**
 * A051211 Numbers of the form x^2-9^y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051211 extends A051204 {

  @Override
  protected long base() {
    return 9;
  }
}
