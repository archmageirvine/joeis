package irvine.oeis.a312;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A312588 Coordination sequence Gal.6.518.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A312588 extends TilingSequence {

  /** Construct the sequence. */
  public A312588() {
    super(0, new String[]
        { "6.6.3.3;B60+2,A60-2,B240+3,A180+4"
        , "6.3.6.3;C300+3,A300+1,A120+3,D120+1"
        , "6.6.3.3;E60+2,C60-2,B60+1,D180+5"
        , "6.3.3.3.3;B240+4,D60-2,F60+6,E240+3,C180+4"
        , "6.3.3.3.3;C180-1,C300+1,D120+4,F180+5,D0-4"
        , "3.3.3.3.3.3;D0-3,E0+4,D120+3,D180-3,E180+4,D300+3"
        });
    defineBaseSet(0);
  }
}
