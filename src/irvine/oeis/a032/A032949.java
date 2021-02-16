package irvine.oeis.a032;

/**
 * A032949 Numbers whose base-14 representation Sum_{i=0..m} d(i)*14^i has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032949 extends A032937 {

  @Override
  protected int base() {
    return 14;
  }
}
