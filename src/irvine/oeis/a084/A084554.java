package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A084554 Weight distribution of [104,52,20] binary extended quadratic-residue (or QR) code.
 * @author Sean A. Irvine
 */
public class A084554 extends FiniteSequence {

  /** Construct the sequence. */
  public A084554() {
    super(0, FINITE,
      Z.ONE,
      Z.ZERO,
      Z.ZERO,
      Z.ZERO,
      Z.ZERO,
      Z.valueOf(1138150L),
      Z.valueOf(206232780L),
      Z.valueOf(15909698064L),
      Z.valueOf(567725836990L),
      Z.valueOf(9915185041320L),
      Z.valueOf(88355709788905L),
      Z.valueOf(413543821457520L),
      Z.valueOf(1036378989344140L),
      Z.valueOf(1406044530294756L),
      Z.valueOf(1036378989344140L),
      Z.valueOf(413543821457520L),
      Z.valueOf(88355709788905L),
      Z.valueOf(9915185041320L),
      Z.valueOf(567725836990L),
      Z.valueOf(15909698064L),
      Z.valueOf(206232780L),
      Z.valueOf(1138150L),
      Z.ZERO,
      Z.ZERO,
      Z.ZERO,
      Z.ZERO,
      Z.ONE
    );
  }
}

