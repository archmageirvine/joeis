package irvine.oeis.a032;

/**
 * A032956 Numbers whose base-6 representation Sum_{i=0..m} d(i)*6^(m-i) has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032956 extends A032953 {

  @Override
  protected int base() {
    return 6;
  }
}
