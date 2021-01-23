package irvine.oeis.a037;

/**
 * A037898 a(n)=(greatest base 4 digit of n)-(least base 4 digit of n).
 * @author Sean A. Irvine
 */
public class A037898 extends A037897 {

  @Override
  protected int base() {
    return 4;
  }
}
