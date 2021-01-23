package irvine.oeis.a037;

/**
 * A037899 a(n)=(greatest base 5 digit of n)-(least base 5 digit of n).
 * @author Sean A. Irvine
 */
public class A037899 extends A037897 {

  @Override
  protected int base() {
    return 5;
  }
}
