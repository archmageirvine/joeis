package irvine.oeis.a032;

/**
 * A032959 Numbers whose base-9 representation Sum_{i=0..m} d(i)*9^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032959 extends A032953 {

  @Override
  protected int base() {
    return 9;
  }
}
