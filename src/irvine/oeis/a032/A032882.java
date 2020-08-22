package irvine.oeis.a032;

/**
 * A032882 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m) has d(0)&lt;d(1)&gt;d(2)&lt;...
 * @author Sean A. Irvine
 */
public class A032882 extends A032874 {

  @Override
  protected int initialDirection() {
    return 1;
  }
}
