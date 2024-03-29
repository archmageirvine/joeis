package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313663 Coordination sequence Gal.5.296.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313663 extends TilingSequence {

  /** Construct the sequence. */
  public A313663() {
    super(0, new String[]
        { "4.4.3.3.3;A180-1,A0-2,B0+1,C180+4,D0+3"
        , "4.4.3.3.3;A0+3,B180+2,A180-3,C0-5,C180+5"
        , "6.3.3.3.3;C180-1,E300+1,D180+4,A180+4,B180+5"
        , "3.3.3.3.3.3;C0-3,A180-5,A0+5,C180+3,E120+5,E300+3"
        , "6.3.3.3.3;C60+2,C60-2,D60+6,E180+4,D240+5"
        });
    defineBaseSet(0);
  }
}
