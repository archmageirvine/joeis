package irvine.oeis.a037;

/**
 * A037903 a(n)=(greatest base 9 digit of n)-(least base 9 digit of n).
 * @author Sean A. Irvine
 */
public class A037903 extends A037897 {

  @Override
  protected int base() {
    return 9;
  }
}
