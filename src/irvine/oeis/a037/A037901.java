package irvine.oeis.a037;

/**
 * A037901 a(n)=(greatest base 7 digit of n)-(least base 7 digit of n).
 * @author Sean A. Irvine
 */
public class A037901 extends A037897 {

  @Override
  protected int base() {
    return 7;
  }
}
