package irvine.oeis.a032;

/**
 * A032957 Numbers n such that base 7 representation Sum_{i=0..m} d(i)*7^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032957 extends A032953 {

  @Override
  protected int base() {
    return 7;
  }
}
