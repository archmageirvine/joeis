package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313174 Coordination sequence Gal.6.478.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313174 extends TilingSequence {

  /** Construct the sequence. */
  public A313174() {
    super(0, new String[]
        { "6.4.4.3;B60+2,C300+1,A240-3,D120+1"
        , "6.3.3.3.3;A180-1,A300+1,D60+5,E120+5,D60-5"
        , "6.4.3.4;A60+2,F300+1,E240+3,C0-4"
        , "4.3.4.3.3;A240+4,D0-2,F120+3,E60+1,B300+3"
        , "4.3.4.3.3;D300+4,C120-3,C120+3,D300-4,B240+4"
        , "6.4.3.4;C60+2,C60-2,D240+3,D240-3"
        });
    defineBaseSet(0);
  }
}
