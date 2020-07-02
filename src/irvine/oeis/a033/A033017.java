package irvine.oeis.a033;

/**
 * A033017 Numbers n such that every run of digits of n in base 4 has length <code>&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A033017 extends A033015 {

  @Override
  protected int base() {
    return 4;
  }
}
