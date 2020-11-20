package irvine.oeis.a032;

/**
 * A032966 Numbers n such that base 16 representation Sum_{i=0..m} d(i)*16^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032966 extends A032953 {

  @Override
  protected int base() {
    return 16;
  }
}
