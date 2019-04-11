package irvine.oeis.a009;

/**
 * A009388 If <code>a, b</code> in sequence, so is <code>a*b-1</code>.
 * @author Sean A. Irvine
 */
public class A009388 extends A009293 {

  @Override
  protected long add() {
    return -1;
  }
}
