package irvine.oeis.a032;

/**
 * A032965 Numbers n such that base 15 representation Sum_{i=0..m} d(i)*15^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032965 extends A032953 {

  @Override
  protected int base() {
    return 15;
  }
}
