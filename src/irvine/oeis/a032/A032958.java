package irvine.oeis.a032;

/**
 * A032958 Numbers n such that base 8 representation Sum_{i=0..m} d(i)*8^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032958 extends A032953 {

  @Override
  protected int base() {
    return 8;
  }
}
