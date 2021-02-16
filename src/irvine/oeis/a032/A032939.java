package irvine.oeis.a032;

/**
 * A032939 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032939 extends A032937 {

  @Override
  protected int base() {
    return 4;
  }
}
