package irvine.oeis.a000;

/**
 * A000729 Expansion of Product_{k <code>&gt;= 1} (1 - x^k)^6</code>.
 * @author Sean A. Irvine
 */
public class A000729 extends A000727 {

  @Override
  protected int power() {
    return 6;
  }
}
