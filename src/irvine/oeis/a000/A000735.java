package irvine.oeis.a000;

/**
 * A000735 Expansion of Product_{k&gt;=1} <code>(1 - x^k)^12</code>.
 * @author Sean A. Irvine
 */
public class A000735 extends A000727 {

  @Override
  protected int power() {
    return 12;
  }
}
