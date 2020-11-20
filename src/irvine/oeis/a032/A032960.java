package irvine.oeis.a032;

/**
 * A032960 Numbers n such that base 10 representation Sum_{i=0..m} d(i)*10^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032960 extends A032953 {

  @Override
  protected int base() {
    return 10;
  }
}
