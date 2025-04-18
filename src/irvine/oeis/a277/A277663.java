package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-11-01.ack/holos at 2024-11-01 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A277663 3rd-order coefficients of the 1/N-expansion of traces of negative powers of real Wishart matrices with parameter c=2.
 * -2*x*(2*x^3-9*x^2+19*x+3)/(x^2-6*x+1)^(7/2)-2*x*(6*x^4-5*x^3+9*x^2-15*x-3)/(x^2-6*x+1)^4
 * @author Georg Fischer
 */
public class A277663 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277663() {
    super(0, "[[0],[4480,-1200,80],[-91980,24480,-1620],[693408,-187089,12621],[-2334912,658197,-45849],[3418190,-987414,68668],[-1090110,217350,-3660],[-383794,283008,-43298],[376842,-216504,29058],[-111238,36150,6028],[11298,12330,-3288],[3402,-2079,189],[30,-45,15]]", "0,0,10,378,7048,96000,1092460,11060700,103150528,905077728,7576640950,61098854454,477942694136", 0, 0);
  }
}
