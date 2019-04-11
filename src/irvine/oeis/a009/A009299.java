package irvine.oeis.a009;

/**
 * A009299 If <code>a,</code> b in sequence, so is a*b+2.
 * @author Sean A. Irvine
 */
public class A009299 extends A009293 {

  @Override
  protected long add() {
    return 2;
  }
}
