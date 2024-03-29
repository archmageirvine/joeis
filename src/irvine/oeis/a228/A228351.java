package irvine.oeis.a228;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a030.A030310;

/**
 * A228351 Triangle read by rows in which row n lists the compositions (ordered partitions) of n (see Comments lines for definition).
 * @author Sean A. Irvine
 */
public class A228351 extends DifferenceSequence {

  /** Construct the sequence. */
  public A228351() {
    super(1, new PrependSequence(new A030310(), 0));
  }
}
