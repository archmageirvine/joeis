package irvine.oeis.a032;

/**
 * A032961 Numbers n such that base 11 representation Sum_{i=0..m} d(i)*11^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032961 extends A032953 {

  @Override
  protected int base() {
    return 11;
  }
}
