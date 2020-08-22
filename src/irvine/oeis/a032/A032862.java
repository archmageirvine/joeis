package irvine.oeis.a032;

/**
 * A032862 Numbers n such that base 7 representation Sum{d(i)*7^i: i=0,1,...,m) has d(m)&gt;d(m-1)&lt;d(m-2)&gt;...
 * @author Sean A. Irvine
 */
public class A032862 extends A032845 {

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
