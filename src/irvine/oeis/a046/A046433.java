package irvine.oeis.a046;

/**
 * A046433 Numbers such that 3 steps are needed to reach a prime under "Sum of digits raised to its digits' powers" procedure.
 * @author Sean A. Irvine
 */
public class A046433 extends A046432 {

  @Override
  protected int steps() {
    return 3;
  }
}
