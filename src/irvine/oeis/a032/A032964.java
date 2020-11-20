package irvine.oeis.a032;

/**
 * A032964 Numbers n such that base 14 representation Sum_{i=0..m} d(i)*14^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032964 extends A032953 {

  @Override
  protected int base() {
    return 14;
  }
}
