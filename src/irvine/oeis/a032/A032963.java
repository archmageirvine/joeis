package irvine.oeis.a032;

/**
 * A032963 Numbers whose base-13 representation Sum_{i=0..m} d(i)*13^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032963 extends A032953 {

  @Override
  protected int base() {
    return 13;
  }
}
