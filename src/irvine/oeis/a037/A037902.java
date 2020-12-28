package irvine.oeis.a037;

/**
 * A037902 a(n)=(greatest base 8 digit of n)-(least base 8 digit of n).
 * @author Sean A. Irvine
 */
public class A037902 extends A037897 {

  @Override
  protected int base() {
    return 8;
  }
}
