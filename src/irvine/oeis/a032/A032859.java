package irvine.oeis.a032;

/**
 * A032859 Numbers n such that base 4 representation Sum{d(i)*4^i: i=0,1,...,m) has d(m)&gt;d(m-1)&lt;d(m-2)&gt;...
 * @author Sean A. Irvine
 */
public class A032859 extends A032842 {

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
