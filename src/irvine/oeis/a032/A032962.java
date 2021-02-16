package irvine.oeis.a032;

/**
 * A032962 Numbers whose base-12 representation Sum_{i=0..m} d(i)*12^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032962 extends A032953 {

  @Override
  protected int base() {
    return 12;
  }
}
