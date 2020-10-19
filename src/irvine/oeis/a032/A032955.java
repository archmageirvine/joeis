package irvine.oeis.a032;

/**
 * A032955 Numbers n such that base 5 representation Sum_{i=0..m} d(i)*5^i has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032955 extends A032953 {

  @Override
  protected int base() {
    return 5;
  }
}
