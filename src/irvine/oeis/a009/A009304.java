package irvine.oeis.a009;

/**
 * A009304 If <code>a, b</code> in sequence, so is <code>ab+5</code>.
 * @author Sean A. Irvine
 */
public class A009304 extends A009293 {

  @Override
  protected long add() {
    return 5;
  }
}
